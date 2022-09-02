// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.HelloRequest in simple.proto
import Foundation
import Wire

/**
 *  Hello request
 */
public struct HelloRequest {

    public var unknownFields: Data = .init()

    public init() {
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension HelloRequest : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension HelloRequest : Hashable {
}
#endif

extension HelloRequest : Proto3Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension HelloRequest : Codable {
}
#endif
